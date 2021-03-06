package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model.{ ApplicationVersionDescription, DescribeApplicationVersionsResult }
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object DescribeApplicationVersionsResultFactory {

  def create(): DescribeApplicationVersionsResult = new DescribeApplicationVersionsResult()

}

class RichDescribeApplicationVersionsResult(val underlying: DescribeApplicationVersionsResult)
    extends AnyVal with PimpedType[DescribeApplicationVersionsResult] {

  def applicationVersions: Seq[ApplicationVersionDescription] = underlying.getApplicationVersions.asScala.toVector

  def applicationVersions_=(value: Seq[ApplicationVersionDescription]): Unit =
    underlying.setApplicationVersions(value.asJava)

  def withApplicationVersions(value: Seq[ApplicationVersionDescription]): DescribeApplicationVersionsResult =
    underlying.withApplicationVersions(value.asJava)

}

