package top.mylogos.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import top.mylogos.entity.DemandePaiement;
import top.mylogos.entity.ReponsePaiement;

@WebService
public class BanqueServiceImpl implements BanqueService {

	@Override
	@WebMethod
	public ReponsePaiement demanderPaiement(DemandePaiement demande) {
		// TODO
		return new ReponsePaiement(true);
	}

}
