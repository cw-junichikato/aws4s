package com.github.j5ik2o.aws.dynamodb.document

import com.amazonaws.services.dynamodbv2.document.{Item, BatchGetItemOutcome}
import com.amazonaws.services.dynamodbv2.model.{BatchGetItemResult, KeysAndAttributes}
import com.github.j5ik2o.aws.PimpedType

import scala.collection.JavaConverters._

object BatchGetItemOutcomeFactory {

  def apply(result: BatchGetItemResult): BatchGetItemOutcome = new BatchGetItemOutcome(result)

}

class RichBatchGetItemOutcome(val underlying: BatchGetItemOutcome) extends AnyVal with PimpedType[BatchGetItemOutcome] {

  def tableItems: Map[String, Seq[Item]] =
    underlying.getTableItems.asScala.map(e => (e._1, e._2.asScala)).toMap

  def unprocessedKeys: Map[String, KeysAndAttributes] =
    underlying.getUnprocessedKeys.asScala.toMap

  def batchGetItemResult: BatchGetItemResult = underlying.getBatchGetItemResult

}