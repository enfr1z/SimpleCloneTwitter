package ru.twitter.repos;

import org.springframework.data.repository.CrudRepository;
import ru.twitter.domain.Message;

import java.util.List;

public interface MessageRepos extends CrudRepository <Message, Long> {
    List<Message> findByTag(String tag);
}
