package cats.tests

import cats.MonadCombine
import cats.laws.discipline.{MonadCombineTests, SerializableTests}

class VectorTests extends CatsSuite {
  checkAll("Vector[Int]", MonadCombineTests[Vector].monadCombine[Int, Int, Int])
  checkAll("MonadCombine[Vector]", SerializableTests.serializable(MonadCombine[Vector]))
}
