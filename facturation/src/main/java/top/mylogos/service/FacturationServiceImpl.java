package top.mylogos.service;

import javax.jws.WebMethod;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import top.mylogos.entity.Commande;
import top.mylogos.entity.Facture;
import top.mylogos.entity.Utilisateur;

@Service
@WebService(endpointInterface = "top.mylogos.service.FacturationService")
public class FacturationServiceImpl implements FacturationService {

	@Override
	@WebMethod
	public int responseFacturation(Commande commande, Utilisateur utilisateur) {
		int numDeFactureFake = 123456789;
		Facture nouvelleFacture = new Facture(1, numDeFactureFake, commande);

		return numDeFactureFake;
	}

}
