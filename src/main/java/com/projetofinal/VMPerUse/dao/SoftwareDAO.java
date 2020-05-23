package com.projetofinal.VMPerUse.dao;

import org.springframework.data.repository.CrudRepository;
import com.projetofinal.VMPerUse.model.Software;
import com.projetofinal.VMPerUse.model.Solicitacao;

public interface SoftwareDAO extends CrudRepository<Software, Integer> {

}
