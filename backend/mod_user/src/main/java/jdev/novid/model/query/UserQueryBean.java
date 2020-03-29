package jdev.novid.model.query;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import jdev.novid.common.identity.UserId;
import jdev.novid.common.value.Mobile;
import jdev.novid.component.persistence.PersistenceQualifiers;
import jdev.novid.model.domain.User;

@Service
@Transactional(readOnly = true)
public class UserQueryBean implements UserQuery {

    @Autowired
    @Qualifier(PersistenceQualifiers.JPA)

    @Override
    public Optional<User> find(Mobile mobile) {

        return null;

    }

    @Override
    public User get(UserId userId) {

        return null;

    }

}
