/**
 * Account  Process
 * Account Process
 *
 * OpenAPI spec version: 1.0.0
 * Contact: nombre.apellidos@gruposantander.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */
package io.swagger.client.model

import io.swagger.client.core.ApiModel
import org.joda.time.DateTime
import java.util.UUID

case class Errors (
  /* Array of errors */
  errors: Option[Seq[Error]] = None
) extends ApiModel

