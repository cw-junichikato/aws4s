package org.sisioh.aws4s.cfn.model

import com.amazonaws.services.cloudformation.model.DescribeStackEventsRequest
import org.sisioh.aws4s.PimpedType

object DescribeStackEventsRequestFactory {

  def create(): DescribeStackEventsRequest = new DescribeStackEventsRequest

}

class RichDescribeStackEventsRequest(val underlying: DescribeStackEventsRequest)
    extends AnyVal with PimpedType[DescribeStackEventsRequest] {

  def stackNameOpt: Option[String] = Option(underlying.getStackName)

  def stackNameOpt_=(value: Option[String]): Unit =
    underlying.setStackName(value.orNull)

  def withStackNameOpt(value: Option[String]): DescribeStackEventsRequest =
    underlying.withStackName(value.orNull)

  // ---

  def nextTokenOpt: Option[String] = Option(underlying.getNextToken)

  def nextTokenOpt_=(value: Option[String]): Unit =
    underlying.setNextToken(value.orNull)

  def withNextTokenOpt(value: Option[String]): DescribeStackEventsRequest =
    underlying.withNextToken(value.orNull)

}
