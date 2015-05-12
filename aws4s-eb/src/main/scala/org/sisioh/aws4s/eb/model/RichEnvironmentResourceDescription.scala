package org.sisioh.aws4s.eb.model

import com.amazonaws.services.elasticbeanstalk.model._
import org.sisioh.aws4s.PimpedType

import scala.collection.JavaConverters._

object EnvironmentResourceDescriptionFactory {

  def create(): EnvironmentResourceDescription = new EnvironmentResourceDescription()

}

class RichEnvironmentResourceDescription(val underlying: EnvironmentResourceDescription)
    extends AnyVal with PimpedType[EnvironmentResourceDescription] {

  def environmentNameOpt: Option[String] = Option(underlying.getEnvironmentName)

  def environmentNameOpt_=(value: Option[String]): Unit =
    underlying.setEnvironmentName(value.orNull)

  def withEnvironmentNameOpt(value: Option[String]): EnvironmentResourceDescription =
    underlying.withEnvironmentName(value.orNull)

  // ---

  def autoScalingGroups: Seq[AutoScalingGroup] = underlying.getAutoScalingGroups.asScala.toVector

  def autoScalingGroups_=(value: Seq[AutoScalingGroup]): Unit =
    underlying.setAutoScalingGroups(value.asJava)

  def withAutoScalingGroups(value: Seq[AutoScalingGroup]): EnvironmentResourceDescription =
    underlying.withAutoScalingGroups(value.asJava)

  // ---

  def instances: Seq[Instance] = underlying.getInstances.asScala.toVector

  def instances_=(value: Seq[Instance]): Unit =
    underlying.setInstances(value.asJava)

  def withInstances(value: Seq[Instance]): EnvironmentResourceDescription =
    underlying.withInstances(value.asJava)

  // ---

  def launchConfigurations: Seq[LaunchConfiguration] = underlying.getLaunchConfigurations.asScala.toVector

  def launchConfigurations_=(value: Seq[LaunchConfiguration]): Unit =
    underlying.setLaunchConfigurations(value.asJava)

  def withLaunchConfigurations(value: Seq[LaunchConfiguration]): EnvironmentResourceDescription =
    underlying.withLaunchConfigurations(value.asJava)

  // ---

  def loadBalancers: Seq[LoadBalancer] = underlying.getLoadBalancers.asScala

  def loadBalancers_=(value: Seq[LoadBalancer]): Unit =
    underlying.setLoadBalancers(value.asJava)

  def withLoadBalancers(value: Seq[LoadBalancer]): EnvironmentResourceDescription =
    underlying.withLoadBalancers(value.asJava)

  // ---

  def triggers: Seq[Trigger] = underlying.getTriggers.asScala

  def triggers_=(value: Seq[Trigger]): Unit =
    underlying.setTriggers(value.asJava)

  def withTriggers(value: Seq[Trigger]): EnvironmentResourceDescription =
    underlying.withTriggers(value.asJava)

  // ---

  def queues: Seq[Queue] = underlying.getQueues.asScala

  def queues_=(value: Seq[Queue]): Unit =
    underlying.setQueues(value.asJava)

  def withQueues(value: Seq[Queue]): EnvironmentResourceDescription =
    underlying.withQueues(value.asJava)
}
