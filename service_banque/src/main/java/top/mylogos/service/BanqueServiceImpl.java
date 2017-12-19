package top.mylogos.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import top.mylogos.entity.DemandePaiement;
import top.mylogos.entity.ReponsePaiement;

@Service
@WebService(endpointInterface = "top.mylogos.service.BanqueService")
public class BanqueServiceImpl implements BanqueService {

	@Override
	@WebMethod
	public ReponsePaiement demanderPaiement(DemandePaiement demande) {
		// TODO
		return new ReponsePaiement(true);
	}

}
