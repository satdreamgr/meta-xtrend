KV = "3.8.7"
SRCDATE = "20180409"

RDEPENDS_${PN} += "et-fpupdate-${MACHINE}"

require et-dvb-modules.inc

SRC_URI[md5sum] = "008a12ecb0e0adb3bb81ab500889ebe0"
SRC_URI[sha256sum] = "03e9095946426b9b749bc8ba198f0f38afba53937a006cab3882a4ffbf4031fb"

COMPATIBLE_MACHINE = "et9.00"
