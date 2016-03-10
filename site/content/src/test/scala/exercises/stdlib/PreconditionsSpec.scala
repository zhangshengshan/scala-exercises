package exercises

import stdlib._
import shapeless.HNil

import org.scalatest.Spec
import org.scalatest.prop.Checkers

// FIXME: get rid of this if possible
import org.scalacheck.Shapeless._

class PreconditionsSpec extends Spec with Checkers {
  def `can be added to constructors` = {
    check(
      Test.success(
        Preconditions.preconditionsPreconditions _,
        27 :: HNil
      )
    )
  }
}
