package secondarysort;

import org.apache.hadoop.io.WritableComparable;
import org.apache.hadoop.io.WritableComparator;
import writable.WikiWritable;

public class WikiComparator extends WritableComparator {
  public WikiComparator() {
    super(WikiWritable.class, true);
  }

  @Override
  public int compare(WritableComparable wc1, WritableComparable wc2) {
    WikiWritable w1 = (WikiWritable) wc1;
    WikiWritable w2 = (WikiWritable) wc2;
    return w1.compareTo(w2);
  }
}
