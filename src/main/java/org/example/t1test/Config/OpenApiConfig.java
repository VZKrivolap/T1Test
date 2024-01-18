package org.example.t1test.Config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;

@OpenAPIDefinition(
        info = @Info(
                title = "For T1",
                contact = @Contact(
                        name = "Vadim Zolotarev",
                        email = "vz984762@gmail.com"
                )
        )
)
public class OpenApiConfig {

}