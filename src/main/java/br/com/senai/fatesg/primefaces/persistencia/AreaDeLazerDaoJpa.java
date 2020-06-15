package br.com.senai.fatesg.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.AreaDeLazer;


@Repository("AreaDeLazerDao")
public class AreaDeLazerDaoJpa extends PersistenciaJpa<AreaDeLazer> implements AreaDeLazerDao{

   private static final long serialVersionUID = 1L;

}
