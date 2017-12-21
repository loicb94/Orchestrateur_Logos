package top.mylogos.service;

import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import org.springframework.stereotype.Service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import top.mylogos.entity.DemandePaiement;
import top.mylogos.entity.ReponsePaiement;

@Service
@WebService(endpointInterface = "top.mylogos.service.BanqueService", targetNamespace = "http://wsbanque.service.mylogos.top")
public class BanqueServiceImpl implements BanqueService {

	@Override

	public String demanderPaiement(String demande) {
		ObjectMapper mapper = new ObjectMapper();
		String Reponse;
		DemandePaiement demandeEnJson;
		try {
			demandeEnJson = mapper.readValue(demande, DemandePaiement.class);
			System.out.println(demandeEnJson.toString());

			if (demandeEnJson.getNumeroCarte().equals("1234567891011123") && demandeEnJson.getCvv().equals("123")
					&& demandeEnJson.getMoisExpiration() == 12 && demandeEnJson.getAnneeExpiration() == 2018) {

				Reponse = mapper.writeValueAsString(new ReponsePaiement(true));
				return Reponse;

			} else {

				Reponse = mapper.writeValueAsString(new ReponsePaiement(false));
				return Reponse;

			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}


	}

}
