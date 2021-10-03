package net.lianbian.tpc.protocol.handler;

public interface Handler {
    String command();

    String handle(String data);
}
