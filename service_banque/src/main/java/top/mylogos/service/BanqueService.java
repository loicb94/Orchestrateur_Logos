package top.mylogos.service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import top.mylogos.entity.DemandePaiement;
import top.mylogos.entity.ReponsePaiement;

@WebService(targetNamespace = "http://wsbanque.service.mylogos.top")
public interface BanqueService {

	@WebMethod(operationName = "payer")
	@WebResult(name = "retourPaiement")
	public String demanderPaiement(@WebParam(name = "paiement") String demande);
}
