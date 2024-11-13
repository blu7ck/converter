package com.blu4ck.converter.history;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRecordRepository extends JpaRepository<HistoryRecord, Long> {
    // İhtiyaç halinde özel sorgu metodları ekleyebilirsin.
}
