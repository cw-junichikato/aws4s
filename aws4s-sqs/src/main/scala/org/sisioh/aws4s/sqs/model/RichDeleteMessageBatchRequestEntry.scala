package org.sisioh.aws4s.sqs.model

import com.amazonaws.services.sqs.model.DeleteMessageBatchRequestEntry
import org.sisioh.aws4s.PimpedType

class RichDeleteMessageBatchRequestEntry(val underlying: DeleteMessageBatchRequestEntry)
  extends AnyVal with PimpedType[DeleteMessageBatchRequestEntry] {

}