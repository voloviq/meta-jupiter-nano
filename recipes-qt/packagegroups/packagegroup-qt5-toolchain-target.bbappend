RDEPENDS_${PN}_remove += "\
   qtenginio-dev \
   qtenginio-mkspecs \
   qt3d-mkspecs \
   ${@bb.utils.contains('DISTRO_FEATURES', 'opengl', 'qtenginio-qmlplugins', '', d)} \
   ${@bb.utils.contains('DISTRO_FEATURES', 'x11', '${USE_X11}', '', d)} \
   "
