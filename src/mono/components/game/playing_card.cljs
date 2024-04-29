(ns mono.components.game.playing-card)

(def ^:const inner-template
  [:svg
   [:ellipse {:cx "50%" :cy "50%"
              :rx "34%" :ry "40%"}]])

(defn- card-template
  "Creates a playing card with the given suit and value.
  If a state-class-name is provided, it will be added to
  the card's class list."
  ([suit value] (card-template suit value nil nil))
  ([suit value state-class-name] (card-template suit value state-class-name nil))
  ([suit value state-class-name inner]
  [:div.playing-card {:className state-class-name}
   [:div.playing-card-inner
    [:div.playing-card-front {:className suit :data-suit suit :data-value value}
     inner
     [:div.value-middle value]]
    [:div.playing-card-back
     [:div.playing-card-back-inner]]]]))

(defn card []
  (card-template "mint" "3" "revealed" inner-template))
