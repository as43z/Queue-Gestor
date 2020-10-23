import edu.upc.eetac.dsa.QueueInter;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestQueueInter {
    QueueInter<Integer> q;

    @Before
    public void setUp() throws Exception{
        this.q = new QueueInter<Integer>(4);
        q.push(1);
        q.push(2);
        q.push(3);
    }

    @After
    public void tearDown(){
        this.q = null;
    }

    @Test
    public void testSize(){
        Assert.assertEquals(3, this.q.size());
    }

    @Test
    public void testPush() throws Exception{
        this.q.push(4);
        Assert.assertEquals(4, this.q.size());
    }

    @Test
    public void testPop() throws Exception{
        int firstElem = this.q.pop();
        Assert.assertEquals(1, firstElem);
    }
}
