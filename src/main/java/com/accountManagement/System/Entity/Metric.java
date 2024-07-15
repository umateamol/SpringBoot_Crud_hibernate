package com.accountManagement.System.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;

@Entity
public class Metric {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long metricId;

    @ManyToOne
    @JoinColumn(name = "account_id")
    private account account;

    private String metricName;
    private Double metricValue;
    private LocalDateTime recordedAt;

    public Long getMetricId() {
        return metricId;
    }

    public void setMetricId(Long metricId) {
        this.metricId = metricId;
    }

    public com.accountManagement.System.Entity.account getAccount() {
        return account;
    }

    public void setAccount(com.accountManagement.System.Entity.account account) {
        this.account = account;
    }

    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public Double getMetricValue() {
        return metricValue;
    }

    public void setMetricValue(Double metricValue) {
        this.metricValue = metricValue;
    }

    public LocalDateTime getRecordedAt() {
        return recordedAt;
    }

    public void setRecordedAt(LocalDateTime recordedAt) {
        this.recordedAt = recordedAt;
    }
}