require u-boot-atmel.inc
require u-boot-envs-atmel.inc

LICENSE = "GPLv2+"
LIC_FILES_CHKSUM = "file://README;beginline=57;endline=60;md5=744e7e3bb0c94b4b9f6b3db3bf893897"

SRCREV = "e7f22e2ee4e7e05723e53081b1acb91c7bd9eeb7"

PV = "v2021.04-at91+git${SRCPV}"

DEPENDS += "bison-native flex-native"

COMPATIBLE_MACHINE = '(jupiter-nano)'

UBRANCH = "u-boot-2021.04-at91"

SRC_URI = "git://github.com/linux4sam/u-boot-at91.git;protocol=https;branch=${UBRANCH}"
SRC_URI += "file://001-add-jupiter-nano-dts-files-u-boot.patch"

S = "${WORKDIR}/git"

PACKAGE_ARCH = "${MACHINE_ARCH}"
