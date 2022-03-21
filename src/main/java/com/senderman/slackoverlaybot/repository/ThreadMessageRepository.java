package com.senderman.slackoverlaybot.repository;

import com.senderman.slackoverlaybot.model.ThreadMessage;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadMessageRepository extends CrudRepository<ThreadMessage, String> {
}
