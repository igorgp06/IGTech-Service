package br.com.igsolutions.igTechService.repositories;

import br.com.igsolutions.igTechService.model.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface clientRepository extends JpaRepository<Client, Long> {

}
