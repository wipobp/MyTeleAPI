package com.bank.td.api;


import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@javax.annotation.Generated(value = "class io.swagger.codegen.languages.SpringCodegen", date = "2018-07-03T11:20:20.842Z")

@Api(value = "data", description = "the data API")
public interface DataApi {

    @ApiOperation(value = "", notes = "", response = Void.class, tags={ "1_1_0", })
    @ApiResponses(value = {  })
    @RequestMapping(value = "/data",
        produces = { "application/json" }, 
        consumes = { "application/json" },
        method = RequestMethod.GET)
    default ResponseEntity<Void> dataGet() {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

}
