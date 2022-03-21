package com.senderman.slackoverlaybot.repository;

import com.senderman.slackoverlaybot.model.ThreadMember;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ThreadMemberRepository extends CrudRepository<ThreadMember, String> {
}
