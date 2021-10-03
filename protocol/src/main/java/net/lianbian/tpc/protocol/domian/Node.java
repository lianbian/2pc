package net.lianbian.tpc.protocol.domian;

import java.net.URL;

/**
 * 节点
 */
public interface Node {
    /**
     * 名称
     * @return
     */
    String name();

    /**
     * 通信地址
     * @return
     */
    URL communicationAddr();
}
