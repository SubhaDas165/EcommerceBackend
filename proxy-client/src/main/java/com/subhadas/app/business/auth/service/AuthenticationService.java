package com.subhadas.app.business.auth.service;

import com.subhadas.app.business.auth.model.request.AuthenticationRequest;
import com.subhadas.app.business.auth.model.response.AuthenticationResponse;

public interface AuthenticationService {
	
	AuthenticationResponse authenticate(final AuthenticationRequest authenticationRequest);
	Boolean authenticate(final String jwt);
	
}
