package websitelog;

import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;

import org.apache.hadoop.io.Writable;

public class DealerUrlCount implements Writable {

    private String _dealerID;

    private String _url;

    private int _count = 0;

    public String get_dealerID() {
        return _dealerID;
    }

    public void set_dealerID(String _dealerID) {
        this._dealerID = _dealerID;
    }

    public String get_url() {
        return _url;
    }

    public void set_url(String _url) {
        this._url = _url;
    }

    public int get_count() {
        return _count;
    }

    public void set_count(int _count) {
        this._count = _count;
    }

    @Override
    public String toString() {

        return _dealerID + "\t" + _url + "\t" + _count;
    }

    @Override
    public void write(DataOutput out) throws IOException {

        out.writeUTF(_url);
        out.writeUTF(_dealerID);
        out.writeInt(_count);

    }

    @Override
    public void readFields(DataInput in) throws IOException {

        this._url = in.readUTF();
        this._dealerID = in.readUTF();
        this._count = in.readInt();

    }

}
