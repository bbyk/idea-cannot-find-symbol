package bbyk.intellij.bugs;

import net.spy.memcached.*;
import net.spy.memcached.ops.Operation;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.Collection;
import java.util.List;

/**
 * Hello world!
 */
public class MyOwnMemcacheConnection extends MemcachedConnection {
    /**
     * Construct a {@link net.spy.memcached.MemcachedConnection}.
     *
     * @param bufSize   the size of the buffer used for reading from the server.
     * @param f         the factory that will provide an operation queue.
     * @param a         the addresses of the servers to connect to.
     * @param obs       the initial observers to add.
     * @param fm        the failure mode to use.
     * @param opfactory the operation factory.
     * @throws java.io.IOException if a connection attempt fails early
     */
    public MyOwnMemcacheConnection(int bufSize, ConnectionFactory f, List<InetSocketAddress> a, Collection<ConnectionObserver> obs, FailureMode fm, OperationFactory opfactory) throws IOException {
        super(bufSize, f, a, obs, fm, opfactory);
    }

    @Override
    protected void addOperation(String key, Operation o) {
        super.addOperation(key, o);
    }
}
