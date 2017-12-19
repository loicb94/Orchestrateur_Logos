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
		if(demande.getNumeroCarte().equals("1234567891011123") && demande.getCvv().equals("123") && demande.getMoisExpiration() == 12 && demande.getAnneeExpiration() == 2018){
			return new ReponsePaiement(true);
		}else{
			return new ReponsePaiement(false);
		}
	}

}
