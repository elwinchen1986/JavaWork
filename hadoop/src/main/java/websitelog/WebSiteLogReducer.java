package websitelog;

import java.io.IOException;

import org.apache.hadoop.io.NullWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Reducer;

public class WebSiteLogReducer extends Reducer<Text, DealerUrlCount, DealerUrlCount, NullWritable> {

    @Override
    protected void reduce(Text key, Iterable<DealerUrlCount> values, Context context)
            throws IOException, InterruptedException {

        DealerUrlCount bean = new DealerUrlCount();

        for (DealerUrlCount dealerUrlCount : values) {

            int count = bean.get_count();
            String dealerid = dealerUrlCount.get_dealerID();
            String url = dealerUrlCount.get_url();

            bean.set_dealerID(dealerid);
            bean.set_url(url);

            if (key.toString().equals(dealerid + "_" + url)) {

                bean.set_count(count + 1);

            }

        }

        context.write(bean, NullWritable.get());

    }

}
