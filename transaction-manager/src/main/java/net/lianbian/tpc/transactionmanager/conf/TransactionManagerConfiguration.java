package net.lianbian.tpc.transactionmanager.conf;

import net.lianbian.tpc.protocol.domian.DefaultCoordinator;
import net.lianbian.tpc.protocol.domian.Node;
import net.lianbian.tpc.protocol.domian.NodeImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

@Configuration
public class TransactionManagerConfiguration {

    @Bean
    public DefaultCoordinator defaultCoordinator() {
        final ArrayList<Node> nodes = new ArrayList<>(3);
        try {
            nodes.add(new NodeImpl("BOC", new URL("http", "127.0.0.1", 8001, "/api")));
            nodes.add(new NodeImpl("CCB", new URL("http", "127.0.0.1", 8002, "/api")));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
        try {
            final DefaultCoordinator defaultCoordinator = new DefaultCoordinator("transactionManager", nodes, new URL("http", "127.0.0.1", 8000, "/api"));
            return defaultCoordinator;
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
