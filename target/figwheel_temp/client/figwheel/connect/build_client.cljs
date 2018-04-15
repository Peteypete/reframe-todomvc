(ns figwheel.connect.build-client (:require [todomvc.core] [figwheel.client] [figwheel.client.utils]))
(figwheel.client/start {:on-jsload (fn [& x] (if js/todomvc.core.main (apply js/todomvc.core.main x) (figwheel.client.utils/log :debug "Figwheel: :on-jsload hook 'todomvc.core/main' is missing"))), :build-id "client", :websocket-url "ws://localhost:3450/figwheel-ws"})

