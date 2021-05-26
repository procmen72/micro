package mx.com.axity.userservice.web.rest;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import mx.com.axity.userservice.commons.constants.Constants;
import mx.com.axity.userservice.commons.to.ResponseTestTO;


@RestController
@RequestMapping("users/v1")
@Api(value = "serviceusers")
public class UsersController {
	
	static final Logger LOG = LogManager.getLogger(UsersController.class);
	
	@GetMapping(value="/users", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> getAllUsers () {
		return new ResponseEntity<String>(Constants.RESPONSE_TEST_MESSAGE, HttpStatus.OK);
	}
	
	@GetMapping(value="/user/{id}", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> getUserById () {
		return new ResponseEntity<String>(Constants.RESPONSE_TEST_MESSAGE, HttpStatus.OK);
	}
	
	@PostMapping(value="/users", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> createUser () {
		return new ResponseEntity<String>(Constants.RESPONSE_TEST_MESSAGE, HttpStatus.OK);
	}
	
	@PutMapping(value="/users", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> updateUser () {
		return new ResponseEntity<String>(Constants.RESPONSE_TEST_MESSAGE, HttpStatus.OK);
	}
	
	@DeleteMapping(value="/users", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<String> deleteUser () {
		return new ResponseEntity<String>(Constants.RESPONSE_TEST_MESSAGE, HttpStatus.OK);
	}
	
	@GetMapping(value = "/test", produces = { MediaType.APPLICATION_JSON_VALUE })
	public ResponseEntity<ResponseTestTO> test() {
		LOG.info("Se invoca /test");
		ResponseTestTO returnResponse = new ResponseTestTO();
		returnResponse.setCode(200);
		returnResponse.setMesage("Servicio OK ..");
		return new ResponseEntity<ResponseTestTO>(returnResponse, HttpStatus.OK);
	}

}
