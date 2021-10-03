package net.lianbian.tpc.protocol.conf;

import net.lianbian.tpc.protocol.domian.Node;

import java.net.URL;

public class TransactionManagerNode implements Node {
    private String name;
    private URL address;

    public TransactionManagerNode(String name, URL address) {
        this.name = name;
        this.address = address;
    }

    public String name() {
        return null;
    }

    public URL communicationAddr() {
        return null;
    }
}
