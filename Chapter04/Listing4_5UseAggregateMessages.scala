myGraph.aggregateMessages[Int](_.sendToSrc(1), _ + _).collect