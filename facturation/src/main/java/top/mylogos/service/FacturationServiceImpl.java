package top.mylogos.service;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.databind.ObjectMapper;

import top.mylogos.entity.Commande;
import top.mylogos.entity.Facture;
import top.mylogos.entity.Utilisateur;

@Service
@WebService(endpointInterface = "top.mylogos.service.FacturationService", targetNamespace = "http://wsFacturation.service.mylogos.top")
public class FacturationServiceImpl implements FacturationService {

	@Override

	public String responseFacturation(String commande, String utilisateur) {
		int numDeFactureFake = 123456789;
		String fakeNumber = Integer.toString(numDeFactureFake);
		System.out.println(commande);
		System.out.println(utilisateur);
		ObjectMapper mapper = new ObjectMapper();
		Commande commandeObj;
		System.out.println("Je suis bien dans le WS facturation");
		try {
			commandeObj = mapper.readValue(commande, Commande.class);
			Utilisateur utilisateurObj = mapper.readValue(utilisateur, Utilisateur.class);
			Facture nouvelleFacture = new Facture(1, numDeFactureFake, commandeObj);

			return fakeNumber;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}

	}

}
