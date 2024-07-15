package com.accountManagement.System.Controller;

import com.accountManagement.System.Entity.Metric;
import com.accountManagement.System.service.MetricService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/metrics")
public class MetricController {

    @Autowired
    private MetricService metricService;

    @GetMapping
    public List<Metric> getAllMetrics() {
        return metricService.getAllMetrics();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Metric> getMetricById(@PathVariable Long id) {
        Metric metric = metricService.getMetricById(id);
        return ResponseEntity.ok(metric);
    }

    @PostMapping
    public Metric createMetric(@RequestBody Metric metric) {
        return metricService.createMetric(metric);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Metric> updateMetric(@PathVariable Long id, @RequestBody Metric metricDetails) {
        Metric updatedMetric = metricService.updateMetric(id, metricDetails);
        return ResponseEntity.ok(updatedMetric);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMetric(@PathVariable Long id) {
        metricService.deleteMetric(id);
        return ResponseEntity.ok().build();
    }
}