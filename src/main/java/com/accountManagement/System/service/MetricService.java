package com.accountManagement.System.service;

import com.accountManagement.System.Entity.Metric;
import com.accountManagement.System.ResourceNotFoundException;
import com.accountManagement.System.repository.MetricRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MetricService {

    @Autowired
    private MetricRepository metricRepository;

    public List<Metric> getAllMetrics() {
        return metricRepository.findAll();
    }

    public Metric getMetricById(Long id) {
        return metricRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Metric not found with id " + id));
    }

    public Metric createMetric(Metric metric) {
        return metricRepository.save(metric);
    }

    public Metric updateMetric(Long id, Metric metricDetails) {
        Metric metric = metricRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Metric not found with id " + id));

        metric.setMetricName(metricDetails.getMetricName());
        metric.setMetricValue(metricDetails.getMetricValue());
        metric.setAccount(metricDetails.getAccount());
        // Update other fields as needed

        return metricRepository.save(metric);
    }

    public void deleteMetric(Long id) {
        Metric metric = metricRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Metric not found with id " + id));

        metricRepository.delete(metric);
    }
}