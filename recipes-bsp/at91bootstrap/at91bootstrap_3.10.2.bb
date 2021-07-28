require at91bootstrap.inc

LIC_FILES_CHKSUM = "file://main.c;endline=27;md5=a2a70db58191379e2550cbed95449fbd"

COMPATIBLE_MACHINE = '(jupiter-nano)'

SRC_URI = "git://github.com/linux4sam/at91bootstrap.git;protocol=https"

PV = "3.10.2+git${SRCPV}"
SRCREV = "2edb4dd14120c7b6d5794e496ecabf274095d1f5"

S = "${WORKDIR}/git"

AT91BOOTSTRAP_BIN_PATH = "${S}/binaries"

AT91BOOTSTRAP_CONFIG_PATH = "${S}/board/${AT91BOOTSTRAP_MACHINE}"
