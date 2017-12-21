package top.mylogos.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import top.mylogos.entity.Commande;
import top.mylogos.entity.Utilisateur;

@WebService(targetNamespace = "http://wsFacturation.service.mylogos.top")
public interface FacturationService {

	@WebMethod(operationName = "facturer")
	@WebResult(name = "resultFacturation")
	public String responseFacturation(@WebParam(name = "commande") String commande,
			@WebParam(name = "utilisateur") String utilisateur);

}
