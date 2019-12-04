package com.telkom.reacttestapp2.repository.search;
import com.telkom.reacttestapp2.domain.Job;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

/**
 * Spring Data Elasticsearch repository for the {@link Job} entity.
 */
public interface JobSearchRepository extends ElasticsearchRepository<Job, Long> {
}
