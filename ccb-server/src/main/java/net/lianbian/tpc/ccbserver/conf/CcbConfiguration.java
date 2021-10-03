/*
 * www.yiji.com Inc.
 * Copyright (c) 2014 All Rights Reserved
 */

/*
 * 修订记录:
 * daidai@yiji.com 2016-03-29 22:49 创建
 *
 */
package net.lianbian.tpc.ccbserver.conf;

import net.lianbian.tpc.bankcommon.domain.BankingParticipant;
import net.lianbian.tpc.protocol.conf.TransactionManagerNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * @author daidai@yiji.com
 */
@Configuration
public class CcbConfiguration {

    @Bean
    public TransactionManagerNode transactionManagerNode() {
        try {
            return new TransactionManagerNode("transactionManager", new URL("http", "127.0.0.1", 8000, "/api"));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    @Bean
    public BankingParticipant bankingParticipant() {
        try {
            return new BankingParticipant("CCB", new URL("http", "127.0.0.1", 8002, "/api"));
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }
}
