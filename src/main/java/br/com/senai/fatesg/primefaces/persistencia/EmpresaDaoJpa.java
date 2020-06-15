package br.com.senai.fatesg.primefaces.persistencia;

import org.springframework.stereotype.Repository;

import br.com.ambientinformatica.jpa.persistencia.PersistenciaJpa;
import br.com.senai.fatesg.primefaces.entidade.Empresa;
import br.com.senai.fatesg.primefaces.entidade.Imovel;


@Repository("EmpresaDao") 
public class EmpresaDaoJpa extends PersistenciaJpa<Empresa> implements EmpresaDao{

   private static final long serialVersionUID = 1L;

}
