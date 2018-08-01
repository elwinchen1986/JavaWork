package websitelog;

import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.hadoop.io.LongWritable;
import org.apache.hadoop.io.Text;
import org.apache.hadoop.mapreduce.Mapper;

public class WebSiteLogMapper extends Mapper<LongWritable, Text, Text, DealerUrlCount> {

    private Text dealerid = new Text();

    private DealerUrlCount dealerUrlCount = new DealerUrlCount();

    public void map(LongWritable ikey, Text ivalue, Context context) throws IOException, InterruptedException {

        String value = new String(ivalue.getBytes(), 0, ivalue.getLength(), "GBK");

        String[] dealerids = value.split(",");

        // ������ID dealerids[4]
        // ҳ��URL dealerids[13]

        Pattern pattern = Pattern.compile("(?<=http://dealer.xingyuanauto.com/)[\\w/]+");
        Matcher match = pattern.matcher(dealerids[13]);

        if (match.find()) {
            String url = match.group();

            dealerUrlCount.set_dealerID(dealerids[4]);
            dealerUrlCount.set_url(url);
            dealerUrlCount.set_count(0);

            dealerid.set(dealerids[4] + "_" + url);

            context.write(dealerid, dealerUrlCount);
        }

    }

}
