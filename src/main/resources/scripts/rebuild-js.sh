sbt fastLinkJS # fast build
sbt fullLinkJS # For prod: compressed build
# set scalaJSStage in Global := FullOptStage # by default is: 'FastOptStage'