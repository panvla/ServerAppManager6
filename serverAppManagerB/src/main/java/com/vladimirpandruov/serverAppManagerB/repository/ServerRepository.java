package com.vladimirpandruov.serverAppManagerB.repository;

import com.vladimirpandruov.serverAppManagerB.domain.Server;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServerRepository extends JpaRepository<Server, Long> {

    Server findByIpAddress(String ipAddress);

}
