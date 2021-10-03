package net.lianbian.tpc.protocol.domian;

import java.io.Serializable;
import java.util.Date;

public interface LogRecord extends Serializable{

    String transactionId();

    TransactionStatus status();

    void setStatus(TransactionStatus status);

    Date createTime();

    Date lastModifyTime();

    void setModifyTime(Date date);
}
