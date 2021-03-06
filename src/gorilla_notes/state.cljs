(ns gorilla-notes.state
  (:require
    [reagent.core :as reagent]))

(def *state
  (reagent/atom
   {:ids []
    :ids-set #{}
    :id->content {}}))

(defn reset-ids! [ids]
  (swap! *state assoc :ids ids))

(defn set-uid! [uid]
  (swap! *state assoc :uid uid))
